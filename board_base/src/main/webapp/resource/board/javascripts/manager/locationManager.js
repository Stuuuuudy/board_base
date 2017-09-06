/**
 * Created by
 * @author Jehun Jeon
 * @since 2017-09-06 09:53
 */
// TODO locationManager 필요성에 대해 생각하자.
board.manager.locationManager = (function() {

	var HASH_PREFIX = '$';
	var HASH_DELIMITER = '#';
	var VIEW_TYPE_VALUE_INDEX = 0;
	var IDENTIFIER_VALUE_INDEX = 1;

	// TODO route 에 대한 불확실성을 가지고 있기 때문에 바람직한 방법을 생각하자.
	var _cMap = {
		route : null
	};

	/**
	 * locationManager의 초기화 함수.
	 * @param opts
	 * @private
	 */
	var _init = function(opts) {
		_.extend(_cMap, opts);
		window.onhashchange = _onHashChange;
	};

	/**
	 * Hash 값이 변경되었을 때 동작하는 핸들러
	 * @private
	 */
	var _onHashChange = function() {
		var viewType = _getHashValueByIndex(VIEW_TYPE_VALUE_INDEX);
		var identifier = _getHashValueByIndex(IDENTIFIER_VALUE_INDEX);
		_cMap.route(viewType, identifier);
	};

	/**
	 * Hash 값 중 index 에 해당하는 위치의 값을 반환한다.
	 * @param index
	 * @private
	 */
	var _getHashValueByIndex = function(index) {
		index = _.defaultTo(index, 0);
		return _getHashValue()[index];
	};

	/**
	 * Hash 값을 구분자를 제외한 리스트로 반환한다.
	 * @returns {Array}
	 * @private
	 */
	var _getHashValue = function() {
		var hash = location.hash;
		return hash.replace(HASH_PREFIX, '').split(HASH_DELIMITER);
	};

	return {
		init : function(opts) {
			_init(opts);
		}
	};

}());