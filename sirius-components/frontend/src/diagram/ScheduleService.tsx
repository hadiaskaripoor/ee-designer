import axios from 'axios';


class ScheduleService {
    getObjects(docuId, projId, objId, kind, label) {
        return axios.get(getURL(docuId, projId, objId, kind, label));
    }
}

const getURL = function (docuId, projId, objId, kind, label) {
    console.log("getUrl!docuId:");
    console.log(docuId);
    return `http://localhost:8080/api/model/schedules/coordinates?documentId=${docuId}&projectId=${projId}&objectId=${objId}&kind=${kind}&label=${label}`
}

export default new ScheduleService();