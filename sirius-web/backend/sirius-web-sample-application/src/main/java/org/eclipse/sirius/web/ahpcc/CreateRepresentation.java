package org.eclipse.sirius.web.ahpcc;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import java.io.IOException;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class CreateRepresentation {

    public static String createRepresentation(String editingContextId, String objectId, String representationName) throws IOException {
        String id = "8016b11c-f8f6-11eb-9a03-0242ac130003"; //$NON-NLS-1$
        System.out.println("test"); //$NON-NLS-1$
        // TODO This is the id for representation type "diagram" -> I still have to check if this might change and how I
        // can extract this value if it does change
        String representationDescriptionId = "960a6b52-09a2-4345-b040-717d976f8cc3"; //$NON-NLS-1$

        System.out.println("Data for representation creation: " //$NON-NLS-1$
                + "\n	editingContextId: " + editingContextId //$NON-NLS-1$
                + "\n	objectId: " + objectId //$NON-NLS-1$
                + "\n	representationName: " + representationName //$NON-NLS-1$
                + "\n	id: " + id //$NON-NLS-1$
                + "\n	representationDescriptionId: " + representationDescriptionId); //$NON-NLS-1$

        HttpPost request = new HttpPost("http://localhost:8080/api/graphql"); //$NON-NLS-1$
        request.setHeader("Content-Type", "application/json"); //$NON-NLS-1$ //$NON-NLS-2$

        String body = "{\"query\":\"  mutation createRepresentation ($input: CreateRepresentationInput!) {    createRepresentation (input: $input) {      __typename  ... on CreateRepresentationSuccessPayload { representation { id label kind __typename } }    ... on ErrorPayload {        message      }    }  }\",\"variables\":{\"input\":{\"id\":\"" //$NON-NLS-1$
                + id + "\",\"objectId\":\"" //$NON-NLS-1$
                + objectId + "\",\"editingContextId\":\"" //$NON-NLS-1$
                + editingContextId + "\",\"representationDescriptionId\":\"" //$NON-NLS-1$
                + representationDescriptionId + "\",\"representationName\":\"" //$NON-NLS-1$
                + representationName + "\"}}}"; //$NON-NLS-1$

        StringBuilder entity = new StringBuilder();
        entity.append(body);
        request.setEntity(new StringEntity(entity.toString()));

        CloseableHttpClient httpClient = HttpClients.createDefault();
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        String responseBody = httpClient.execute(request, responseHandler);
        System.out.println("responseBody : " + responseBody); //$NON-NLS-1$

        // Turn the responseBody String to Json Object

        Gson gson = new Gson();
        JsonObject data = gson.fromJson(responseBody, JsonObject.class);
        JsonPrimitive repId = data.getAsJsonObject("data") //$NON-NLS-1$
                .getAsJsonObject("createRepresentation") //$NON-NLS-1$
                .getAsJsonObject("representation") //$NON-NLS-1$
                .getAsJsonPrimitive("id"); //$NON-NLS-1$

        System.out.println("RepresentationId : " + repId.toString()); //$NON-NLS-1$

        return repId.toString();

    }

}
