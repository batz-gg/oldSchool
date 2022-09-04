import { Injectable, NotFoundException } from '@nestjs/common';
import { InjectModel } from '@nestjs/mongoose';
import { Model } from 'mongoose';
import { Breed, BreedDocument } from '../schemas/breed.schema';
import { CreateBreedDto } from './dto/create-breed.dto';
import { UpdateBreedDto } from './dto/update-breed.dto';

@Injectable()
export class BreedsService {
  constructor(
    @InjectModel(Breed.name) private breedModel: Model<BreedDocument>,
  ) { }

  async create(createBreedDto: CreateBreedDto): Promise<Breed> {
    return await new this.breedModel(createBreedDto).save();
  }

  async findAll() {
    return await this.breedModel.find();
  }

  async findOne(name: string) {
    let res = await this.breedModel.findOne({ name });
    if (!res)
      throw new NotFoundException();

    return res;
  }

  async update(name: string, updateBreedDto: UpdateBreedDto) {
    return await this.breedModel.updateOne({ name }, { $set: { ...updateBreedDto } });
  }

  async remove(name: string) {
    return await this.breedModel.deleteOne({ name });
  }
}
