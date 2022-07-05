import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import reportWebVitals from './reportWebVitals';
import {BrowserRouter, Route} from "react-router-dom";
import DataInput from "./DataInput";

ReactDOM.render(
    <React.StrictMode>
            <BrowserRouter>
                <Route path ="/" element ={<App/>}>
                    <Route path="/input" element = {<DataInput/>} />
                </Route>
            </BrowserRouter>
    </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
