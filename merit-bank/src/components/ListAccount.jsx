import React, { Component } from 'react';
import AccountService from '../services/AccountService';
import { Card, CardImg, CardText, CardBody, CardTitle, CardSubtitle, Button, CardBlock, Col, CardLink } from 'reactstrap';


class ListAccount extends Component {
    constructor(props) {
        super(props)

        this.state = {
            accountType: []
        }

        this.openCheckAccount = this.openCheckAccount.bind(this);
        this.openSaveAccount = this.openSaveAccount.bind(this);
        this.deleteAccount = this.deleteAccount.bind(this);


    }

    deleteAccount(id) {
        AccountService.deleteAccount(id).then( res => {
            this.setState({accountType: this.state.accountType.filter(accountType => accountType.id !== id)});
        });
    }
    viewAccount(id){
        this.props.history.push(`/view-accountType/${id}`);
    }
    //editAccountHolder(id){
      //  this.props.history.push(`/add-accountholder/${id}`);
    //}

    componentDidMount(){ 
        AccountService.getAccountType().then((res) => { 
            this.setState({ accountType: res.data});
        });
    }

    openCheckAccount() {
        this.props.history.push('/add-accountType/open_check');
    }

    
    openSaveAccount() {
        this.props.history.push('/add-accountType/open_save');
    }


    withdrawAccount(){
        this.props.history.push('/add-accountType/_withdraw');

    }

    depositAccount(){
        this.props.history.push('/add-accountType/_deposit');

    }

    transferAccount(){
        this.props.history.push('/add-accountType/_transfer');

    }
    
    




    render() {
        return (
            <div>
                <h1 className="text-center">Welcome, User!</h1>
                <div className= "row">
                    <button className="btn btn-primary" onClick={this.openCheckAccount}> Open Checking Account</button>
                </div>
                <div className= "row">
                    <button className="btn btn-primary" onClick={this.openSaveAccount}> Open Savings Account</button>
                </div>

                <br></br>
                        
                <Card className="col-12 col-md-5 m-1"> 
                    <CardBody>
                        <CardTitle  tag="h3" className="text-center">Checking Account</CardTitle>
                        <CardSubtitle tag="h6" className="mb-2 text-muted">Summary</CardSubtitle>
                        <Button onClick={ () => this.withdrawAccount()}>Withdraw</Button>
                        <Button onClick={ () => this.depositAccount()}>Deposit</Button>
                        <Button onClick={ () => this.transferAccount()}>Transfer</Button>
                            <CardText> 
                            {
                                this.state.accountType.map(
                                    accountType =>
                                    <tr key = { accountType.id}>
                                        <td> { accountType.amount} </td>
                                        <td> { accountType.account} </td>
                                        {/*<td> { accountholder.lastName} </td>*/}

                                        <Col><button style={{marginLeft: "10px"}} onClick={ () => this.viewAccount(accountType.id)} className="btn btn-info">View </button></Col>
                                        {/*<Col><button onClick={ () => this.editAccountHolder(accountholder.id)} className="btn btn-info">Update </button></Col>*/}
                                        <Col><button style={{marginLeft: "10px"}} onClick={ () => this.deleteAccount(accountType.id)} className="btn btn-danger">Delete </button></Col>
                                            
                                     </tr>)
                            }
                            </CardText>
                    </CardBody>
                    
                </Card>
                <div>
                <Card className="col-12 col-md-5 m-1"> 
                    <CardBody>
                        <CardTitle  tag="h3" className="text-center">Savings Account</CardTitle>
                        <CardSubtitle tag="h6" className="mb-2 text-muted">Summary</CardSubtitle>
                        <Button onClick={ () => this.withdrawAccount()}>Withdraw</Button>
                        <Button onClick={ () => this.depositAccount()}>Deposit</Button>
                        <Button onClick={ () => this.transferAccount()}>Transfer</Button>
                            <CardText> 
                            {
                                this.state.accountType.map(
                                    accountType =>
                                    <tr key = { accountType.id}>
                                        <td> { accountType.amount} </td>
                                        <td> { accountType.account} </td>
                                        {/*<td> { accountholder.lastName} </td>*/}

                                        <Col><button style={{marginLeft: "10px"}} onClick={ () => this.viewAccount(accountType.id)} className="btn btn-info">View </button></Col>
                                        {/*<Col><button onClick={ () => this.editAccountHolder(accountholder.id)} className="btn btn-info">Update </button></Col>*/}
                                        <Col><button style={{marginLeft: "10px"}} onClick={ () => this.deleteAccount(accountType.id)} className="btn btn-danger">Delete </button></Col>
                                            
                                     </tr>)
                            }
                            </CardText>
                    </CardBody>
                    
                </Card>
                </div>
                
        </div>   
        )
    }
            
}


export default ListAccount