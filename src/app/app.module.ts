import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DressComponent } from './dress/dress.component';
import { NavbarComponent } from './navbar/navbar.component';
import { PhotoUploadComponent } from './photo-upload/photo-upload.component';
import { ColourboxComponent } from './colourbox/colourbox.component';
import { ToneSelectorComponent } from './tone-selector/tone-selector.component';
import { LoginComponent } from './login/login.component';
import { LandingComponent } from './landing/landing.component';

@NgModule({
  declarations: [
    AppComponent,
    DressComponent,
    NavbarComponent,
    PhotoUploadComponent,
    ColourboxComponent,
    ToneSelectorComponent,
    LoginComponent,
    LandingComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
