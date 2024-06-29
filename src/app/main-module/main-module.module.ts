import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MainModuleRoutingModule } from './main-module-routing.module';
import { DressComponent } from './dress/dress.component';
import { ColorBoxComponent } from './color-box/color-box.component';
import { PhotoUploadComponent } from './photo-upload/photo-upload.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ToneSelectorComponent } from './tone-selector/tone-selector.component';


@NgModule({
  declarations: [DressComponent, ColorBoxComponent, PhotoUploadComponent, NavbarComponent, ToneSelectorComponent],
  imports: [
    CommonModule,
    MainModuleRoutingModule
  ]
})
export class MainModuleModule { }
