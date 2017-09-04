/**
 * Created by
 * @author Jehun Jeon
 * @since 2017-09-04 22:33
 */

board.main = (function() {

	var _voMap = {};
	var _vMap = {};
	var _sMap = {};
	var _cMap = {};

	/**
	 * 초기화 함수
	 * @param opts _cMap에 오버라이드 할 옵션
	 * @private
	 */
	var _init = function(opts) {
		_.extend(_cMap, opts);
		_createView();
		_initViewState();
	};

	/**
	 * main 레이아웃을 정의한다.
	 * @private
	 */
	var _createView = function() {
		console.log('_createView : ' + arguments);

		_vMap.main = {
			rows : [{
				template : 'row1'
			}]
		};

		_build(_vMap.main);
	};

	/**
	 * 뷰를 빌드한다.
	 * @param view
	 * @private
	 */
	var _build = function(view) {
		webix.ui(view);
	};

	/**
	 * 뷰를 셋업한다.
	 * @private
	 */
	var _setupView = function() {
		console.log('_setupView : ' + arguments);
	};

	/**
	 * 뷰와 상태를 초기화 한다.
	 * @private
	 */
	var _initViewState = function() {
		console.log('_initViewState : ' + arguments);
	};

	return {
		initModule : function(opts) {
			_init(opts);
		}
	};

}());