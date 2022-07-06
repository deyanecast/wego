# from car import car
# if __name__ == "__main__":
#     print("Hola Mundo")
#     car.license = "AMQ123"
#     car.driver = "Andres Herrera"
#     print(vars(car))

#     car2 = car()
#     car2.license = "PTM123"
#     car2.driver = "Andrea Herrera"
#     print(vars(car2))

from car import car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")

    car = car("AMS345", Account("Andres Herrera","Holi"))
    print(vars(car))
    print(vars(car.driver))