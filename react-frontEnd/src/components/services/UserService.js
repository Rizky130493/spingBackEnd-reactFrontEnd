import React from 'react';
import axios from 'axios';



const GET= 'http://localhost:8080/api/users';
class UserService {
    getUsers(){
       return  axios.get(GET);
    }
}

export default new UserService();
