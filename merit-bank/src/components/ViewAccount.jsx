/*View button will display Transaction Details Page
with amount and account type info*/

import React, { Component } from 'react'
import AccountService from '../services/AccountService'

class ViewAccount extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id: this.props.match.params.id, //match the specific id 
            accountType: {} //add object to the state of the component
        }
    }
    
    componentDidMount(){
        AccountService.getAccountTypeById(this.state.id).then( res => {
            this.setState({accountType: res.data}); //adding response data to setState method
        })
    }

    /*Transcation Detail Card Display*/
    render() {
        return (
            <div>
                <br></br>
                <div className = "card col-md-6 offset-md-3">
                    <h3 className = "text-center">Transaction Details</h3>
                    <div className = "card-body">
                        <div className = "row">
                            <label> Amount: </label>
                            <div> { this.state.accountType.amount }</div>
                        </div>
                        <div className = "row">
                            <label>Account: </label>
                            <div> { this.state.accountType.account }</div>
                        </div>
                    </div>

                </div>
            </div>
        )
    }
}

export default ViewAccount