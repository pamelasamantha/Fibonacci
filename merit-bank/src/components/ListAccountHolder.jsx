import ReactiveButton, { Component } from 'react';
import { textSpanIntersectsWithTextSpan } from 'typescript';
import AccountHolderService from '../services/AccountHolderService';

class ListAccountHolder extends Component {
    constructor(props) {
        super(props)

        this.state = {
            accountholder: []
        }

        this.addAccountHolder = this.addAccountHolder.bind(this);
        this.editAccountHolder = this.editAccountHolder.bind(this);
        this.deleteAccountHolder = this.deleteAccountHolder.bind(this);
    }

    deleteAccountHolder(id) {
        AccountHolderService.deleteAccountHolder(id).then( res => {
            this.setState({accountholder: this.state.accountholder.filter(accountholder => accountholder.id !== id)});
        });
    }
    viewAccountHolder(id){
        this.props.history.push(`/view-accountholder/${id}`);
    }
    editAccountHolder(id){
        this.props.history.push(`/add-accountholder/${id}`);
    }

    componentDidMount(){
        AccountHolderService.getAccountHolder().then((res) => {
            this.setState({accountholder: res.data});
        });
    }

    addAccountHolder() {
        this.props.history.push('/add-accountholder/_add');
    }

    render() {
        return (
            <div>
                <h2 className="text-center">Welcome, User</h2>
                <div className= "row">
                    <button className="btn btn-primary" onClick={this.addAccountHolder}> Add Account</button>
                </div>
                <br></br>
                <div className="row">
                    <table className="table table-striped table-bordered">

                        <thead>
                            <tr>
                                <th>Checking Account</th>
                                <th>Savings Account</th>
                                {/*<th>AccountHolder</th>*/}
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.accountholder.map(
                                    accountholder =>
                                    <tr key = {accountholder.id}>
                                        <td> { accountholder.firstName}</td>
                                        <td> { accountholder.middleName}</td>
                                        <td> { accountholder.lastName}</td>
                                        <td>
                                            <button onClick={ () => this.editAccountHolder(accountholder.id)} className="btn btn-info">Update </button>
                                            <button style={{marginLeft: "10px"}} onClick={ () => this.deleteAccountHolder(accountholder.id)} className="btn btn-danger">Delete </button>
                                            <button style={{marginLeft: "10px"}} onClick={ () => this.viewAccountHolder(accountholder.id)} className="btn btn-info">View </button>
                                        </td>
                                    </tr>
                                )
                            }
                        </tbody>
                    </table>

                </div>

            </div>
        )
    }
}

export default ListAccountHolder