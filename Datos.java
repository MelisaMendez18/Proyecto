@PostMapping("/cargar-inicial")
public void cargarDatosIniciales() {
    productoService.guardarProducto(new Producto("Aceite de coco", 50, 10.00));
    productoService.guardarProducto(new Producto("Hojuela de coco", 30, 15.50));
    productoService.guardarProducto(new Producto("Coco cabello de ángel", 20, 25.00));
    productoService.guardarProducto(new Producto("Leche de coco", 40, 8.00));
    productoService.guardarProducto(new Producto("Crema de coco", 35, 12.00));
}