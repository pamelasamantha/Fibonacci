import React, { Component } from 'react';
import AccountHolderService from '../services/AccountHolderService';

class CreateAccountHolder extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id : this.props.match.params.id,
            firstName: '',
            middleName: '',
            lastName: ''
            
        }

        this.changeFirstNameHandler = this.changeFirstNameHandler.bind(this);
        this.changeMiddleNameHandler = this.changeMiddleNameHandler.bind(this);
        this.changeLastNameHandler = this.changeLastNameHandler.bind(this);
    }

    componentDidMount() {

        if(this.state.id == '_add') {
            return 
        } else { 
            AccountHolderService.getAccountHolderById(this.state.id).then ( (res) =>{
                let accountholder = res.data;
                this.setState({firstName: accountholder.firstName,
                    middleName: accountholder.middleName,
                    lastName: accountholder.lastName 
                });
            });
        }
    }

    saveOrUpdateAccountHolder = (e) => {
        e.preventDefault();
        let accountholder = {firstName: this.state.firstName, middleName: this.state.middleName, lastName: this.state.lastName};
        console.log('accountholder => ' + JSON.stringify(accountholder));

        if(this.state.id === '_add') {
            AccountHolderService.createAccountHolder(accountholder).then(res => {
                this.props.history.push('/accountholder');
            });
        } else {
            AccountHolderService.updateAccountHolder(accountholder, this.state.id).then( res => {
                this.props.history.push('/accountholder');
            });
        }
    }

    changeFirstNameHandler= (event) => {
        this.setState({firstName: event.taget.value});
    }
    changeMiddleNameHandler= (event) => {
        this.setState({middleName: event.target.value});
    }
    changeLastNameHandler= (event) => {
        this.setState({lastName: event.target.value});
    }
    cancel() {
        this.props.history.push('/accountholder');
    }
    getTitle(){
        if(this.state.id ==='_add') {
            return <h3 className="text-center">Add AccountHolder</h3>
        } else {
            return <h3 className="text-center">Update AccountHolder</h3>
        }
    }
    
    render() {
        return (
            <div>
                <br></br>
                <div className = "container">
                    <div className = "row">
                        <div className = "card col-md-6 offset-md-3 offset-md-3">
                        {
                            this.getTitle()
                        }
                        <div className= "card-body">
                            <form>
                            <div className= "form-group">
                                <label> First Name: </label>
                                <input placeholder="First Name" name="firstName" className="form-control"
                                    value={this.state.firstName} onChange={this.changeFirstNameHandler}/>
                        </div>
                        <div className= "form-group">
                                <label> Middle Name: </label>
                                <input placeholder="Middle Name" name="middleName" className= "form-control"
                                    value={this.state.middleName} onChange={this.changeMiddleNameHandler}/>
                        </div>
                        <div className= "form-group">
                            <label> Last Name: </label>
                            <input placeholder="Last Name" name="lastName" className= "form-control"
                                value={this.state.lastName} onChange={this.changeLastNameHandler}/>
                        </div>

                        <button className="btn btn-success" onClick={this.saveOrUpdateAccountHolder}>Save</button>
                        <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft: "10px"}}>Cancel</button>
                            </form>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        )
    }
}

export default CreateAccountHolder