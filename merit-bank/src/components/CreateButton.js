import React, { useState } from 'react';
//import ReactiveButton from 'reactive-button';


function CreateButton ()  {

   const [state, setState] = useState('idle');


    const onClickHandler = () => {

    }

    /*loading animation once button is clicked*/ 
   /* const onClickHandler = () => {
        setState('loading');
        setTimeout(() => {
            setState('success');
        }, 2000);
    }*/

    return (


        /*<ReactiveButton
        buttonState={state}
        onClick={onClickHandler}
        idleText="Create Account"
        color={'dark'}
        rounded={true}
        size="large"
        className={'createBtn'}
        />*/
        <button>Create Checking Account</button>
    );

}

export default CreateButton;