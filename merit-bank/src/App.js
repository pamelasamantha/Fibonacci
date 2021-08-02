
import './App.css';
import {  BrowserRouter as Router, Route, Link, Switch, BrowserRouter } from 'react-router-dom';
import About from './components/About'
import Contact from './components/Contact'
import Home from './components/Home'
import Navbar from './components/Navbar'
import Footer from './components/Footer'
import ListAccountHolder from './components/ListAccountHolder';
import CreateAccountHolder from './components/CreateAccountHolder';
import UpdateAccountHolder from './components/UpdateAccountHolder';
import ViewAccountHolder from './components/ViewAccountHolder';



export default function App() {


  return (
    <div>
      <Router>
        <Navbar />
        <div className="container">
          <Switch>
              <Route path ="/" exact component ={ListAccountHolder}></Route>
              <Route path = "/acctholder" component = {ListAccountHolder}></Route>
              <Route path = "/add-acctholder/:id" component = {CreateAccountHolder}></Route>
              <Route path = "/view-acctholder/:id" component = {ViewAccountHolder}></Route>
          </Switch>
        </div>
        <Footer />
      </Router>
    </div>

    /*
    <BrowserRouter>
    <Router>
      <Navbar />
     
        <div className="App">
        <div className="App-header"> 
            <Switch>
              <Route exact path='/'>
                <Home />
              
              </Route>
              <Route exact path='/about'>
                <About />
              </Route>
              <Route exact path='/contact'>
                <Contact />
              </Route>
            </Switch>
            
        </div>
        </div>
        <Footer />
    </Router>
    </BrowserRouter>*/
    
  );
}



