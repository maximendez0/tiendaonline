$(function(){
	// resolver problema menu activo
	switch(menu) {
	case 'contacto':
		$('#contacto').addClass('active');
		break;
	case 'productos':
		$('#productos').addClass('active');
		break;
	case 'servicio tecnico':
		$('#serviciotecnico').addClass('active');
		break;
	default:
		$('#inicio').addClass('active');
		break;
		
	}
	
});