"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.BreedsService = void 0;
const common_1 = require("@nestjs/common");
const mongoose_1 = require("@nestjs/mongoose");
const mongoose_2 = require("mongoose");
const breed_schema_1 = require("../schemas/breed.schema");
let BreedsService = class BreedsService {
    constructor(breedModel) {
        this.breedModel = breedModel;
    }
    async create(createBreedDto) {
        return await new this.breedModel(createBreedDto).save();
    }
    async findAll() {
        return await this.breedModel.find();
    }
    async findOne(name) {
        let res = await this.breedModel.findOne({ name });
        if (!res)
            throw new common_1.NotFoundException();
        return res;
    }
    async update(name, updateBreedDto) {
        return await this.breedModel.updateOne({ name }, { $set: Object.assign({}, updateBreedDto) });
    }
    async remove(name) {
        return await this.breedModel.deleteOne({ name });
    }
};
BreedsService = __decorate([
    (0, common_1.Injectable)(),
    __param(0, (0, mongoose_1.InjectModel)(breed_schema_1.Breed.name)),
    __metadata("design:paramtypes", [mongoose_2.Model])
], BreedsService);
exports.BreedsService = BreedsService;
//# sourceMappingURL=breeds.service.js.map