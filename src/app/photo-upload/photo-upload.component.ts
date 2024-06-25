import { Component, OnInit } from '@angular/core';
import { ReMarginService } from '../service/re-margin.service';

@Component({
  selector: 'app-photo-upload',
  templateUrl: './photo-upload.component.html',
  styleUrls: ['./photo-upload.component.css']
})
export class PhotoUploadComponent{

  constructor(private remarginservice: ReMarginService) { }
  imageSrc: string | ArrayBuffer | null = null;
  imageStyles = {
    top: '0px',
    left: '0px',
    width: '100%',
    height: 'auto'
  };
  
  top = 0;
  left = 0;
  scale = 1;
  leftmargin: string;
  topmargin: string;

  onFileSelected(event: any): void {
    const file = event.target.files[0];
    if (file) {
      const reader = new FileReader();
      reader.onload = e => this.imageSrc = reader.result;
      reader.readAsDataURL(file);
    }
  }

  move(direction: string): void {
    const step = 10;
    switch (direction) {
      case 'left':
        this.left -= step;
        break;
      case 'right':
        this.left += step;
        break;
      case 'up':
        this.top -= step;
        break;
      case 'down':
        this.top += step;
        break;
    }
    this.updateStyles();
  }

  zoom(direction: string): void {
    const scaleStep = 0.1;
    if (direction === 'in') {
      this.scale += scaleStep;
    } else {
      this.scale = Math.max(0.1, this.scale - scaleStep);
    }
    this.updateStyles();
  }
  centerAndFit(): void {
    this.top = 0;
    this.left = 0;
    this.scale = 1;
    this.imageStyles = {
      top: '0px',
      left: '0px',
      width: '100%',
      height: 'auto'
    };
  }
  dress(): void {
    this.topmargin = "480px";
    this.leftmargin = "680px";
    this.remarginservice.changeMargin(this.topmargin,this.leftmargin)
  }
  reset(): void {
    this.topmargin = "850px";
    this.leftmargin = "1250px";
    this.remarginservice.changeMargin(this.topmargin,this.leftmargin)
  }



  updateStyles(): void {
    this.imageStyles = {
      top: `${this.top}px`,
      left: `${this.left}px`,
      width: `${100 * this.scale}%`,
      height: 'auto'
    };
  }

}
