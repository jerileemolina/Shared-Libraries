def leer_archivo("release.yaml")
archivo = open(release.yaml, «r»)
for linea in archivo:
print(linea)
archivo.close()


