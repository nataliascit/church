module.exports = function(env) {

	const path = require('path');
	const webpack = require("webpack");
    const CopyWebpackPlugin = require('copy-webpack-plugin');
	const ExtractTextPlugin = require('extract-text-webpack-plugin');

	console.log(path.join(__dirname, '..', 'app', 'shared', 'environment', 'locale'));

	const config = {
		entry: "./app/app.module",
		devtool: "source-map",
		output: {
			path: path.join(__dirname, '..', 'build'),
			filename: 'bundle.js',
			publicPath: 'build/'
		},
		module: {
			rules: [
				{
					use: 'babel-loader',
					test: /\.js$/,
					exclude: /node_modules/
				},
				{
					loader: ExtractTextPlugin.extract({
						loader: 'css-loader'
					}),
					test: /\.css$/
				},
				{
					test: /\.(ttf|otf|eot|svg|woff(2)?)(\?[a-z0-9]+)?$/,
					loader: 'file-loader?name=fonts/[name].[ext]'
				},
				{
					test: /\.html$/,
					loader: 'raw-loader'
				},
                {
                	test: /\.json$/,
					loader: 'json-loader'
                }
			]
		},
		plugins: [
			new ExtractTextPlugin('style.css'),
			new webpack.ProvidePlugin({
				$: "jquery",
				jQuery: "jquery"
			}),
            new CopyWebpackPlugin([
                { from: path.join(__dirname, '..', 'app', 'shared', 'environment', 'locale'), to: 'locale' }
             ])
		]
	};
	
	return config;
}