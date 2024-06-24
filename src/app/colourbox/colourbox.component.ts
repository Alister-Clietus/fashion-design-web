import { Component, OnInit } from '@angular/core';
import { ColorChangeService } from '../service/color-change.service';

@Component({
  selector: 'app-colourbox',
  templateUrl: './colourbox.component.html',
  styleUrls: ['./colourbox.component.css']
})
export class ColourboxComponent implements OnInit {

  constructor(private colorChangeService: ColorChangeService) {}

  ngOnInit(): void {
  }
  changeColor(color: string): void {
    this.colorChangeService.updateBackgroundColor(color);
  }
}
