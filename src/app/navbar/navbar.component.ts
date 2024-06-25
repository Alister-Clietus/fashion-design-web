import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
logout() {
  this.router.navigate(['/login']);
}

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

}
