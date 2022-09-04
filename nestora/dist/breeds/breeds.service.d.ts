import { Model } from 'mongoose';
import { Breed, BreedDocument } from '../schemas/breed.schema';
import { CreateBreedDto } from './dto/create-breed.dto';
import { UpdateBreedDto } from './dto/update-breed.dto';
export declare class BreedsService {
    private breedModel;
    constructor(breedModel: Model<BreedDocument>);
    create(createBreedDto: CreateBreedDto): Promise<Breed>;
    findAll(): Promise<(Breed & import("mongoose").Document<any, any, any> & {
        _id: import("mongoose").Types.ObjectId;
    })[]>;
    findOne(name: string): Promise<Breed & import("mongoose").Document<any, any, any> & {
        _id: import("mongoose").Types.ObjectId;
    }>;
    update(name: string, updateBreedDto: UpdateBreedDto): Promise<import("mongodb").UpdateResult>;
    remove(name: string): Promise<import("mongodb").DeleteResult>;
}
