import { Component } from '@angular/core';
import { ThemePalette } from '@angular/material/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'onlineJobPortal';
  links: String[] = [
    'Register',
    'Job Search',
    'Job List',
    'Job Description',
    'Job History'
  ];
  backgroundColor: ThemePalette = "primary";
  activeLink = this.links[0];

  constructor(private router: Router) {
  }

}
