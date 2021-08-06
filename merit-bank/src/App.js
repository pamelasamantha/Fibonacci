import './App.css';
import {  BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Header from './components/Header'
//import Footer from './components/Footer'
import ListAccount from './components/ListAccount';
import CreateAccount from './components/CreateAccount';
import ViewAccount from './components/ViewAccount';



function App() {

  return (
    <div>
      <Router>
            <Header />
              <div className="container">
                <Switch>
                    <Route path ="/" exact component ={ListAccount}></Route>
                    <Route path = "/accountType" component = {ListAccount}></Route>
                    <Route path = "/add-accountType/:id" component = {CreateAccount}></Route>
                    <Route path = "/view-accountType/:id" component = {ViewAccount}></Route>
                </Switch>
              </div>
        </Router>
    </div>

   
  );
}

export default App;



