package org.eclipse.sirius.web.ahpcc;

import java.io.File;
import java.util.UUID;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

public class UploadDocument {

    public UploadDocument(String projectId, String modelFilename) {
        String uploadEndpoint = "http://localhost:8080/api/graphql/upload"; //$NON-NLS-1$
        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost(uploadEndpoint);

        try {
            FileBody model = new FileBody(new File(modelFilename));

            MultipartEntity reqEntity = new MultipartEntity();
            reqEntity.addPart("0", model); //$NON-NLS-1$
            reqEntity.addPart("map", new StringBody("{\"0\":\"variables.file\"}")); //$NON-NLS-1$ //$NON-NLS-2$

            UUID uuid = UUID.randomUUID();
            String modelId = uuid.toString();

            reqEntity.addPart("operations", new StringBody( //$NON-NLS-1$
                    "{\"query\":\"  mutation uploadDocument($input: UploadDocumentInput!) {    uploadDocument(input: $input) {      __typename  ... on UploadDocumentSuccessPayload { id }   ... on ErrorPayload {        message      }    }  }\",\"variables\":{\"input\":{\"id\":\"" //$NON-NLS-1$
                            + modelId + "\",\"editingContextId\":\"" + projectId + "\",\"file\":null}}}")); //$NON-NLS-1$ //$NON-NLS-2$

            httppost.setEntity(reqEntity);
            System.out.println("Requesting : " + httppost.getRequestLine()); //$NON-NLS-1$
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            String responseBody = httpclient.execute(httppost, responseHandler);
            System.out.println("responseBody : " + responseBody); //$NON-NLS-1$

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            httpclient.getConnectionManager().shutdown();
        }
    }

}
