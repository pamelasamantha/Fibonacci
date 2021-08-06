/*Axios Service Page for URL routing*/

import axios from 'axios';

const ACCOUNTHOLDER_API_BASE_URL = "http://localhost:8080/api/v1/accountType";

class AccountService {

    //
    getAccountType() {
        return axios.get(ACCOUNTHOLDER_API_BASE_URL);
    }

    createAccountType(accountType) {
        return axios.post(ACCOUNTHOLDER_API_BASE_URL, accountType);
    }

    //
    getAccountTypeById(accountTypeId) {
        return axios.get(ACCOUNTHOLDER_API_BASE_URL + '/' + accountTypeId);
    }

    //not in use at the moment 
    updateAccountType(accountType, accountTypeId) {
        return axios.put(ACCOUNTHOLDER_API_BASE_URL + '/' + accountTypeId, accountType);
    }

    //Delete button
    deleteAccountType(accountTypeId) {
        return axios.delete(ACCOUNTHOLDER_API_BASE_URL + '/' + accountTypeId);
    }
}

export default new AccountService()