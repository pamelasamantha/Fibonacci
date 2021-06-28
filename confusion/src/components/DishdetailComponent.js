import React, { Component } from 'react';
import { Card, CardImg, CardImgOverlay, CardText, CardBody, CardTitle } from 'reactstrap';

class DishDetailComponent extends Component {
    constructor(props) {
        super(props);
    }

    renderComments(dish) {
        if (dish === 'undefined') {
            return <div></div>
        } else {

            return(

                    dish.comments.map((comment) => {             
                    return (
                        <div key={comment.id}>
                            <p>{comment.comment}</p>
                            <p>{comment.author} {comment.date}</p>
                        </div>
                    );
                })
            );

        }
    }

    renderDishDetails(dish) {
        if (dish === 'undefined') {
            return <div></div>
        } else {
            return (
            <Card>
                <CardImg top src={dish.image} alt={dish.name} />
                <CardBody>
                    <CardTitle>{dish.name}</CardTitle>
                    <CardText>{dish.description}</CardText>
                </CardBody>
            </Card>);

        }
    }

    
    componentDidMount() {
        console.log('Menu Component componentDidMount is invoked');
    }

    onDishSelect(dish) {
        this.setState({ selectedDish: dish});
    }

    
    render() {     
        
        if (this.props.dish == null) {
            return <div></div>
        } else {

        return (
            
            <div className='row'>
                <div className='col-12 col-md-5 m-1'>
                    {this.renderDishDetails(this.props.dish)}
                    

                </div>
                <div className='col-12 col-md-5 m-1'>
                    <h4>Comments</h4>
                    {this.renderComments(this.props.dish)}
                    {}

                </div>
                
            </div>

        

        );
    
        } 

    
    }
}

export default DishdetailComponent;