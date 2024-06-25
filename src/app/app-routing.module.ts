import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DressComponent } from './dress/dress.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ColourboxComponent } from './colourbox/colourbox.component';
import { PhotoUploadComponent } from './photo-upload/photo-upload.component';
import { ToneSelectorComponent } from './tone-selector/tone-selector.component';
import { LoginComponent } from './login/login.component';
import { LandingComponent } from './landing/landing.component';


const routes: Routes = [
  {
    path:"dress",component:DressComponent
  },
  {
    path:"nav",component:NavbarComponent
  },
  {
    path:"colourbox",component:ColourboxComponent
  },
  {
    path:"upload",component:PhotoUploadComponent
  }
  ,
  {
    path:"tone",component:ToneSelectorComponent
  }
  ,
  {
    path:"login",component:LoginComponent
  }
  ,
  {
    path:"landing",component:LandingComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
