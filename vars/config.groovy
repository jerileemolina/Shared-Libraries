def call (Map config = [:]) {
 sh "echo Hola ${config.name}. Hoy es ${config.dayOfWeek}"
}
