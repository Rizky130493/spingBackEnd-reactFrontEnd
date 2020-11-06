import React from 'react'
import UserService from '../components/services/UserService';

class UserComponents extends React.Component{
    constructor (props){
        super(props)

        this.state={
            user:[]
        }
    }

    componentDidMount(){
        UserService.getUsers().then((response)=>{
            this.setState({user: response.data})
        })
    }





    render (){
        return(
            <div>
                <h1 className="text-center">User List</h1>
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <td>User Id</td>
                            <td>USer First Name</td>
                            <td>User Last Name</td>
                            <td>User Email</td>
                        </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.user.map(
                                    user=>
                                    <tr key ={user.key}>
                                        <td>{user.id}</td>
                                        <td>{user.firstName}</td>
                                        <td>{user.lastName}</td>
                                        <td>{user.email}</td>
                                    </tr>
                                )
                            }

                        </tbody>
                </table>


            </div>
        )
    }

}

export default UserComponents