import React from 'react'
import {Link} from'react-router-dom'
import {Nav, Navbar, NavItem, NavbarBrand, Container} from 'reactstrap'

export const Heading = () => {
    return (
        <div>
            <Navbar color="dark" dark>
                <Container>
                    <NavbarBrand>Employee list</NavbarBrand>
                    <Nav>
                        <NavItem>
                            <Link className="btn btn-primary" to="/add">Add Employee</Link>
                        </NavItem>
                    </Nav>
                </Container>
            </Navbar>
        </div>
    )
}
