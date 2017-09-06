/**
 * Created by
 * @author Jehun Jeon
 * @since 2017-09-06 09:53
 */

board.manager.locationManager = (function() {

	var _init = function() {
		window.onhashchange = _onHashChange;
	};

	var _onHashChange = function() {
		console.log('_onHashChange');
	};

	_init();

}());