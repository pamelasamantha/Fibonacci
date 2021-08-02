import React, { Component } from 'react'
import AccountHolderService from '../services/AccountHolderService'

class UpdateAccountHolder extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id: this.props.match.params.id,
            firstName: '',
            middleName: '',
            lastName: '',
        }
        this.changeFirstNameHandler = this.changeFirstNameHandler.bind(this);
        this.changeMiddleNameHandler = this.changeMiddleNameHandler.bind(this);
        this.changeLastNameHandler = this.changeLastNameHandler.bind(this);
        this.updateAccountHolder = this.updateAccountHolder.bind(this);
    }

    componentDidMount() {
        AccountHolderService.getAccountHolderById(this.state.id).then( (res) =>{
            let accountholder = res.data;
            this.setState({firstName: accountholder.firstName,
                middleName: accountholder.middleName,
                lastName: accountholder.lastName 
            });
        });
    }

    updateAccountHolder = (e) => {
        e.preventDefault();
        let accountholder = {firstName: this.state.firstName, middleName: this.state.middleName, lastName: this.state.lastName};
        console.log('accountholder => ' + JSON.stringify(accountholder));
        console.log('id => ' + JSON.stringify(this.state.id));
        AccountHolderService.updateAccountHolder(accountholder, this.state.id).then( res => {
            this.props.history.push('/accountholder');
        });
    }

    changeFirstNameHandler = (event) => {
        this.setState({firstName: event.target.value});
    }
    changeMiddleNameHandler = (event) => {
        this.setState({middleName: event.target.value});
    }

    changeLastNameHandler = (event) => {
        this.setState({lastName: event.target.value});
    }

    cancel() {
        this.props.history.push('/accountholder');
    }

    render() {
        return (
            <div>
                <br></br>
                <div className = "container">
                    <div className = "card col-md-6 offset-md-3 offset-md-3">
                        <h3 className = "text-center">Update AccountHolder</h3>
                        <div className = "card-body">
                            <form>
                                <div className = "form-group">
                                    <label> First Name: </label>
                                    <input placeholder = "First Name" name="firstName" className="form-control"
                                        value={this.state.firstName} onChange={this.changeFirstNameHandler}/>
                                </div>
                                <div className= "form-group">
                                    <label> Middle Name: </label>
                                    <input placeholder="Middle Name" name="middleName" className="form-control"
                                        value={this.state.middleName} onChange={this.changeMiddleNameHandler}/>
                                </div>
                                <div className= "form-group">
                                    <label> Last Name: </label>
                                    <input placeholder="Last Name" name="lastName" className="form-control"
                                        value={this.state.lastName} onChange={this.changeLastNameHandler}/>
                                </div>

                                <button className="btn btn-success" onClick={this.updateAccountHolder}>Save</button>
                                <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft: "10px"}}>Cancel</button>
                            </form>
                        </div>
                    </div>
                </div>

            </div>
        
        )
    }
}

export default UpdateAccountHolder