import React from "react";
import {Link,BrowserRouter as Router ,Routes} from 'react-router-dom';
import { Route } from "react-router-dom";
import App from "./App";
import RegisterForm from "./RegisterForm";
import StudPropsExample from "./StudPropsExample";

const routing=(
    <Router>
        <div>
            <ul>
                <li>
                    <Link to="/">Home</Link>
                </li>
                <li>
                    <Link to="/a">RegisterForm</Link>
                </li>
                <li>
                    <Link to ="/b">StudPropsExample</Link>
                </li>

            </ul>
            <Routes>
                <Route path="/App" element={<App />}/>
                 <Route path="/RegisterForm" element={<RegisterForm />} />
                <Route path="/StudPropsExample" element={<StudPropsExample/>} />
            </Routes>
        </div>
    </Router>
)
export default routing;