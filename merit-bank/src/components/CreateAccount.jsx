/*Create Account Function Buttons*/

import React, { Component } from 'react';
import AccountService from '../services/AccountService';

class CreateAccount extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id : this.props.match.params.id,
            amount: '',
            account: ''
        }

        this.changeAmount = this.changeAmount.bind(this);
        this.changeAccount = this.changeAccount.bind(this);
        this.saveButton = this.saveButton.bind(this);
        this.cancelButton = this.cancelButton.bind(this);
    }

    /*Open Checking and Open Savings Account buttons and Page Routing*/
    componentDidMount() {

        if(this.state.id === 'open_check'&& this.state.id ==='open_save') {
            return 
        } else { 
            AccountService.getAccountTypeById(this.state.id).then ( (res) =>{
                let accountType = res.data;
                this.setState({amount: accountType.amount,
                    account: accountType.account
                });
            });
        }
    }


    /*Save Button for all Page Routing*/
    saveButton = (e) => {
        e.preventDefault();
        let accountType = {amount: this.state.amount, account: this.state.account};
        console.log('accountType => ' + JSON.stringify(accountType));

         //Open Checking Account Page
        if(this.state.id === 'open_check') {
            AccountService.createAccountType(accountType).then(res => {
                this.props.history.push('/accountType'); //navigate to this page
            })
        }
        //Open Savings Account Page
            else if (this.state.id ==='open_save') {
                AccountService.createAccountType(accountType).then(res => {
                    this.props.history.push('/accountType'); //navigate to this page
                })

        }
        //Withdraw Button
            else if (this.state.id ==='_withdraw') {
                AccountService.createAccountType(accountType).then(res => {
                    this.props.history.push('/accountType'); 
                })
        
        }
        //Deposit Button
            else if (this.state.id ==='_deposit') {
                AccountService.createAccountType(accountType).then(res => {
                    this.props.history.push('/accountType'); 
                })
        
        }
        //Transfer Button
            else {
                AccountService.createAccountType(accountType).then(res => {
                    this.props.history.push('/accountType'); 
                })
        }
    }

    /*Handler for amount and account */
    changeAmount= (event) => {
        this.setState({amount: event.target.value});
    }

    changeAccount= (event) => {
        this.setState({account: event.target.value});
    }

    //Cancel button 
    cancelButton() {
        this.props.history.push('/accountType'); //navigate back to the dahshboard account page
    }

    /*Title of Page for each button function and Page Routing*/
    getTitle(){
        if(this.state.id === 'open_check') {
            return <h3 className="text-center">Checking Account Creation Page</h3>

        }else if(this.state.id ==='open_save'){
            return <h3 className="text-center">Savings Account Creation Page</h3>
        }
        else if (this.state.id === '_withdraw') {
            return <h3 className="text-center">Withdraw Page</h3>

        } else if(this.state.id ==='_deposit') {
            return <h3 className="text-center">Deposit Page</h3>
        }

        else {
            return <h3 className ="text-center">Transfer Page</h3>
        }
    }
    

    /*Card Display for amount input based on the Page */
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
                                        <label> Amount: </label>
                                        <input placeholder="Amount" name="amount" className="form-control"
                                            value={this.state.amount} onChange={this.changeAmount}/>
                                    </div>

                                   {/*<div className= "form-group">
                                        <label> Account: </label>
                                        <input placeholder="account" name="account" className= "form-control"
                                        value={this.state.account} onChange={this.changeAccount}/>
                        </div>*/}

                                <button className="btn btn-success" onClick={this.saveButton}>Save</button>
                                <button className="btn btn-danger" onClick={this.cancelButton} style={{marginLeft: "10px"}}>Cancel</button>

                                </form>
                            </div>
                    </div>
                </div>

            </div>
        </div>
        )
    }
}

export default CreateAccount