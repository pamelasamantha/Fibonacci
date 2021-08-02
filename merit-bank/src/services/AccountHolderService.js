import axios from 'axios';

const ACCOUNTHOLDER_API_BASE_URL = "http://localhost:8080/api/v1/accountholder";

class AccountHolderService {
    getAccountHolder() {
        return axios.get(ACCOUNTHOLDER_API_BASE_URL);
    }

    createAccountHolder(acctholder) {
        return axios.post(ACCOUNTHOLDER_API_BASE_URL, acctholder);
    }

    getAccountHolderById(acctholderId) {
        return axios.get(ACCOUNTHOLDER_API_BASE_URL + '/' + acctholderId);
    }

    updateAccountHolder(acctholder, acctholderId) {
        return axios.put(ACCOUNTHOLDER_API_BASE_URL + '/' + acctholderId, acctholder);
    }

    deleteAccountHolder(acctholderId) {
        return axios.delete(ACCOUNTHOLDER_API_BASE_URL + '/' + acctholderId);
    }
}

export default new AccountHolderService()