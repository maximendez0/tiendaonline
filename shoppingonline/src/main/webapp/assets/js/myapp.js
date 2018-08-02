$(function(){
	// resolver problema menu activo
	switch(menu) {
	case 'contacto':
		$('#contacto').addClass('active');
		break;
	case 'productos':
		$('#products').addClass('active');
		break;
	case 'servicio tecnico':
		$('#serviciotecnico').addClass('active');
		break;
	default:
		$('#products').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
		
	}
	
});