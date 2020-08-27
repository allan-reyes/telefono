
public class TelefonoUsuario {
	
	public static void main(String[] args) {
		//PROGRAMA PARA LA CREACIÓN DE UN TELÉFONO
		//MÓVIL DE CUALQUIER MARCA HOY DÍA 
		
		Huawei instaHuawei = new Huawei ();
		
		instaHuawei.setCamaraFrontal(16);
		instaHuawei.setCamaraTrasera1(40);
		instaHuawei.setCamaraTrasera2(61);
		
		System.out.println(instaHuawei.getCamaraFrontal() + " MP");
		System.out.println(instaHuawei.getCamaraTrasera1() + " MP");
		System.out.println(instaHuawei.getCamaraTrasera2() + " MP");
		
		
	}
}
