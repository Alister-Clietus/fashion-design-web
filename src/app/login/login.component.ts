import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  login() {
    // Your login logic here

    // On successful login, navigate to the /dress route
    this.router.navigate(['/landing']);
  }

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

}
