import axios from 'axios';



const GET= 'https://reqres.in/api/users?page=2';
class UserService {
    getUsers(){
       return  axios.get(GET);
    }
}

export default new UserService();
