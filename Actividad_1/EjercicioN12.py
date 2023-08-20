horassemana=48
valorhora=5000
retencion=0.125
horasmensuales=horassemana*4 #Se multiplica por 4 ya que un mes tiene 4 semanas
salariobruto=horasmensuales*valorhora
retencionT=salariobruto*retencion
salarioneto= salariobruto-retencionT
#Se calculan el salario bruto, neto y las retenciones y se imprime
print(f"El salario bruto es: {salariobruto}") 
print("Las retenciones son:", retencionT)
print("El salario neto es:", salarioneto)