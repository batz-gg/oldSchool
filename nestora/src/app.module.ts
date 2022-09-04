/* eslint-disable prettier/prettier */
import { Module } from '@nestjs/common';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { BreedsModule } from './breeds/breeds.module';
import { MongooseModule } from '@nestjs/mongoose';
//mongodb+srv://tselger:1234%^&*@cluster0.mmxftzl.mongodb.net/?retryWrites=true&w=majority
@Module({
  imports: [
    MongooseModule.forRoot("mongodb+srv://tselger:bat1234@cluster0.mmxftzl.mongodb.net/?retryWrites=true&w=majority"),
    BreedsModule
  ],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule { }
