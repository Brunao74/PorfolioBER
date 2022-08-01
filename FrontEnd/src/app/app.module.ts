import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HeaderComponent } from './components/header/header.component';
import { LogoAPComponent } from './components/logo-ap/logo-ap.component';
import { BannerComponent } from './components/banner/banner.component';
import { AcercaDeComponent } from './components/acerca-de/acerca-de.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';;
import { NgCircleProgressModule } from 'ng-circle-progress';
import { FooterComponent } from './components/footer/footer.component';
import { IngresoComponent } from './components/ingreso/ingreso.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { NewExperienciaComponent } from './components/experiencia/new-experiencia.component';
import { NeweducacionComponent } from './components/educacion/neweducacion.component';
import { NewskillsComponent } from './components/skills/newskills.component';
import { NewredesComponent } from './components/socialmedia/newredes.component';
import { NewracercadeComponent } from './components/acerca-de/newracercade.component';
import { EditeducacionComponent } from './components/educacion/editeducacion.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import { EditredesComponent } from './components/socialmedia/editredes.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoAPComponent,
    BannerComponent,
    AcercaDeComponent,
    ExperienciaComponent,
    EducacionComponent,
    FooterComponent,
    IngresoComponent,
    HomeComponent,
    LoginComponent,
    RegisterComponent,
    NewExperienciaComponent,
    NeweducacionComponent,
    NewskillsComponent,
    NewredesComponent,
    NewracercadeComponent,
    EditeducacionComponent,
    EditredesComponent
  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    NgCircleProgressModule.forRoot({}),
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
