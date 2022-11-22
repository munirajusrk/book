    curl --location --request POST 'http://localhost:8080/seed/brand/create' \
    --header 'Content-Type: application/json' \
    --data-raw '{
        {
            "cropCharacter": {
                "character": "SoilType",
                "characterId": 1,
                "cropId": 1,
                "cropName": "Chilli"
            },
            "cropModel": {
                "cropId": 1,
                "cropName": "Chilli"
            },
            "cropOption": {
                "cropId": 1,
                "cropName": "Chilli",
                "option": "Red",
                "optionId": 1
            },
            "description": "SeedData",
            "districtModel": {
                "districtId": 1,
                "name": "DVG"
            },
            "imageModels": [
                {
                    "imageId": 1,
                    "imagePath": "//temp",
                    "partnerModel": {
                        "partnerId": 1,
                        "partnerName": "RB-Seeds"
                    }
                }
            ],
            "packageModels": [
                {
                    "packageId": 1,
                    "packageName": "Chilli Package"
                }
            ],
            "partnerModel": {
                "partnerId": 1,
                "partnerName": "RB-Seeds"
            },
            "partnerModels": [
                {
                    "partnerId": 2,
                    "partnerName": "YB-Seeds"
                }
            ],
            "seedBrandId": 1,
            "stateModel": {
                "name": "Karnataka",
                "stateId": 1
            },
            "status": "ACTIVE",
            "varietyName": "Dyavanuru|Byadagi|Guntur"
        }
    }'