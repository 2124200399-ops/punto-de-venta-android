# 📱 Punto de Venta Android - Jetpack Compose & MVVM

Aplicación móvil nativa para dispositivos Android diseñada para el control de inventario, catálogo comercial y punto de venta ágil, desarrollada con las tecnologías y estándares modernos recomendados por Google.

## 🚀 Tecnologías y Arquitectura

- **Lenguaje:** Kotlin
- **UI Toolkit:** **Jetpack Compose** (UI declarativa reactiva)
- **Diseño:** Material Design 3 (Theming personalizado: Tipografías, Paleta de Colores y Formas)
- **Arquitectura:** **MVVM (Model-View-ViewModel)**
- **Componentes de Android Jetpack:**
  - ViewModel con StateFlow / estado reactivo
  - Activity lifecycles
  - Navigation Compose
  - Material 3 Icons & Surfaces

## 📌 Módulos Principales

- **Módulo de Autenticación:**
  - Pantalla de inicio de sesión (LoginActivity, LoginViewModel) con validación de credenciales.
  - Registro de usuarios y administradores (RegisterActivity, RegisterViewModel).
- **Punto de Venta e Inicio (HomeActivity, HomeViewModel):**
  - Catálogo interactivo de productos.
  - Selección de artículos, conteo y cálculo de total en tiempo real.
  - Interfaz táctil optimizada para teléfonos y tablets.

## ⚙️ Estructura del Proyecto

`	ext
app/src/main/java/com/example/puntodeventaapp/
├── ui/
│   ├── home/         # HomeActivity & HomeViewModel
│   ├── login/        # LoginActivity & LoginViewModel
│   ├── register/     # RegisterActivity & RegisterViewModel
│   └── theme/        # Color, Theme, Type (Material 3)
`

## 🛠️ Requisitos e Instalación

- **Android Studio Ladybug / Koala** o superior
- **JDK 17+**
- **Min SDK:** 24 (Android 7.0+)
- **Target SDK:** 34+

1. Clonar el repositorio:
   `ash
   git clone https://github.com/2124200399-ops/punto-de-venta-android.git
   `
2. Abrir en **Android Studio**.
3. Sincronizar proyecto con Gradle (Sync Project with Gradle Files).
4. Ejecutar en un emulador o dispositivo físico.

---
Proyecto desarrollado enfocado en la creación de interfaces móviles fluidas y arquitectura escalable.