print("El programa calcula el promedio general dependiendo del numero de materias que posea: ")
print("Ingrese el numero de materias: ")
nummaterias = input()
num_materias = int(nummaterias)
calif_global=0
for numMat in range (num_materias):
    print("Ingresa la calificacion de la materia {}".format(numMat+1))
    califun = input()
    calif_un = float(califun)
    calif_global+= calif_un
promedio = calif_global/num_materias
print("El promedio general es de {}".format(promedio))