package co.edu.sena.tarea2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import co.edu.sena.tarea2.ui.theme.Tarea2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tarea2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Variables\n" +
                                "\n" +
                                "Se utiliza la palabra clave (var).\n" +
                                "Específica un tipo tal como String o Int. Puede modificarse.\n" +
                                "\n" +
                                "var nombre = \"Linda\"\n" +
                                "nombre = \"Luna\"\n" +
                                "\n" +
                                "\n" +
                                "| Constantes\n" +
                                "\n" +
                                "Se utiliza la palabra clave (val).\n" +
                                "El valor de estas no puede ser modificado una vez inicializadas.\n" +
                                "\n" +
                                "val pi = 3.14159\n" +
                                "\n" +
                                "\n" +
                                "| Opcionales\n" +
                                "\n" +
                                "Se refiere a variables vacías (null) o que pueden contener un valor. \n" +
                                "Se declaran usando el operador (?).\n" +
                                "\n" +
                                "var nombre: String? = null \n" +
                                "\n" +
                                "\n" +
                                "| Nulos\n" +
                                "\n" +
                                "Se utiliza el sistema de tipos (Tipo?). \n" +
                                "Esto para evitar errores de referencia nula (NullPointerException).\n" +
                                "\n" +
                                "var nombre: String? = null \n" +
                                "val longitud = nombre?.length \n" +
                                "\n" +
                                "\n" +
                                "| README.md\n" +
                                "\n" +
                                "Se utiliza comúnmente en proyectos de software para proporcionar \n" +
                                " documentación básica específica usando el lenguaje Markdown.",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tarea2Theme {
        Greeting("Android")
    }
}