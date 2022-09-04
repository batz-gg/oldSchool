import { BreedsService } from './breeds.service';
import { CreateBreedDto } from './dto/create-breed.dto';
import { UpdateBreedDto } from './dto/update-breed.dto';
export declare class BreedsController {
    private readonly breedsService;
    constructor(breedsService: BreedsService);
    create(createBreedDto: CreateBreedDto): Promise<import("../schemas/breed.schema").Breed>;
    findAll(): Promise<(import("../schemas/breed.schema").Breed & import("mongoose").Document<any, any, any> & {
        _id: import("mongoose").Types.ObjectId;
    })[]>;
    findOne(name: string): Promise<import("../schemas/breed.schema").Breed & import("mongoose").Document<any, any, any> & {
        _id: import("mongoose").Types.ObjectId;
    }>;
    update(name: string, updateBreedDto: UpdateBreedDto): Promise<import("mongodb").UpdateResult>;
    remove(name: string): Promise<import("mongodb").DeleteResult>;
}
