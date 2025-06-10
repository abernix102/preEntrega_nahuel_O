
# ⚙️ Sistema de Gestión - TechLab

> Gestión inteligente de productos y pedidos para entornos CLI, con Java, POO y excepciones custom.  
> Proyecto académico full modular, escalable y con esteroides de buenas prácticas 💉

---

## ✨ Características principales

🧱 **POO real**: encapsulamiento, herencia y polimorfismo  
📦 **Módulos organizados**: modelos, servicios y excepciones bien separados  
🧃 **Subtipos de Producto**: `Comida` y `Bebida` con atributos extra  
🧠 **Manejo de errores**: excepciones personalizadas como `StockInsuficienteException`  
🖥️ **Interfaz CLI** clara e intuitiva  
🔍 **CRUD completo de productos**  
🛒 **Sistema de pedidos** con stock dinámico y validaciones

---

## 📸 Demo del menú

```
SISTEMA DE GESTIÓN - TECHLAB
==================================

1) Agregar producto
2) Listar productos
3) Buscar/Actualizar producto
4) Eliminar producto
5) Crear un pedido
6) Listar pedidos
7) Salir

Elija una opción:
```

---

## 🧠 Arquitectura

```
src/
├── com.techlab.app
│   └── Main.java
├── com.techlab.modelos
│   ├── Producto.java
│   ├── Bebida.java
│   ├── Comida.java
│   ├── LineaPedido.java
│   └── Pedido.java
├── com.techlab.servicios
│   ├── ProductoService.java
│   └── PedidoService.java
└── com.techlab.excepciones
    └── StockInsuficienteException.java
```

---

## 🚀 Cómo correr el proyecto

1. Cloná el repo

```bash
git clone https://github.com/abernix102/preEntrega_nahuel_O.git
cd preEntrega_nahuel_O
```

2. Abrilo en tu IDE (IntelliJ, Eclipse, VS Code)
3. Ejecutá `Main.java`
4. Usá el menú desde la consola

---

## 📌 Requisitos

- Java 17+
- IDE Java (o terminal con `javac`)
- Ganas de testear cosas con `Scanner`

---

## 🤯 Cosas piolas que vas a ver en este código

- Clases con **responsabilidad única**
- Interacción fluida con el usuario por consola
- Subtipos de producto usando herencia
- Uso elegante de `List`, `ArrayList`, y encapsulación de lógica en servicios
- Código limpio, comentado y mantenible

---

## 👨‍💻 Autor

Desarrollado con pasión por:

**Nahuel O.**  
🔗 [GitHub - abernix102](https://github.com/abernix102)

---

## 🪪 Licencia

MIT License — Usalo, modificalo y compartilo libremente. Si te sirvió, dejá una ⭐ ;)

---
> "El software bien hecho no solo funciona, también se entiende."
