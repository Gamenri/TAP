Realizar prácticas que permitan familiarizarse con el desarrollo de GUI y elaborar su correspondiente reporte.

Partiendo de casos de estudio plantear soluciones e identificar cuáles son los eventos que se involucran.

Presentar la solución a un problema y enviar un reporte con el planteamiento del problema y la codificación paso a paso del mismo con capturas de pantalla.

Problema: Calcular el índice de masa corporal de  personas y almacenar los datos estatura, peso e índice de masa corporal y almacena los datos en vectores.

1.-Realizar un botón para Calcular la masa corporal de N  personas:

Calcular el Indice de Masa Corporal (IMC). Datos de entrada el peso actual en kilogramos (kg.) y estatura en metros y la estatura en metros (m).
Paso 1.-Se multiplica la estatura por la estatura. 1.54x1.54=2.37
Paso 2.- Se divide el peso entre el valor obtenido en el paso 1.  70/2.37
Paso 3.-Resultado IMC. 29.5 kg.
Paso 4.-Diagnostico nutricional. Sobrepeso.
En el paso 4, de acuerdo al resultado, indicar el diagnostico nutricional.
Normal es de 18.5 a 24.9
Sobrepeso de 25.0 a 29.9
Obesidad I.  de 30.0 a 34.9
Obesidad II. de 35.0 a 39.9
Obesidad III. de 40.0 o más.

Almacenar los datos  en un vectores o arreglos unidimensionales.

2.-Realizar un botón para salir

INSTRUCCIONES PARA VECTORES

1.-Realizar un botón para almacenar los datos EN LOS VECTORES.

2.-Realizar un botón para mostrar los datos almacenados

Ejemplo de código de apoyo para calcular la masa:
```

imc=Double.parseDouble(FieldPeso.getText())/(Double.parseDouble(FieldEstatura.getText())

*Double.parseDouble(FieldEstatura.getText()));

                   cadena=Double.toString(imc);   

                   

                if(imc<25.0)

                     resultadoIMC.setText(FieldNombre.getText()+" tu IMC es de: "+cadena+" con Normal ");

                if(imc>=25.0 && imc<=29.9)

                     resultadoIMC.setText(FieldNombre.getText()+" tu IMC es de: "+cadena+" con sobrepeso ");

                if(imc>=30.0 && imc<=34.9)

                     resultadoIMC.setText(FieldNombre.getText()+" tu IMC es de: "+cadena+" con Obesidad Tipo I");

                if(imc>=35.0 && imc<=39.9)

                     resultadoIMC.setText(FieldNombre.getText()+" tu IMC es de: "+cadena+" con Obesidad Tipo II");

                if(imc>=40)

                     resultadoIMC.setText(FieldNombre.getText()+" tu IMC es de: "+cadena+" con Obesidad Tipo III");
```
