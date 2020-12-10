'use strict';

// tag::vars[]
const React = require('react'); // <1>
const ReactDOM = require('react-dom'); // <2>
const client = require('./client'); // <3>
// end::vars[]

// tag::app[]
class App extends React.Component { // <1>

	constructor(props) {
		super(props);
		this.state = {books: []};
	}

	componentDidMount() { // <2>
		client({method: 'GET', path: '/api/books'}).done(response => {
			this.setState({books: response.entity._embedded.books});
		});
	}

	render() { // <3>
		return (
			<BookList books={this.state.books}/>
		)
	}
}
// end::app[]

// tag::book-list[]
class BookList extends React.Component{
	render() {
		const books = this.props.books.map(book =>
			<Book key={book._links.self.href} book={book}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>Title</th>
						<th>Author</th>
						<th>ISBN</th>
					</tr>
					{books}
				</tbody>
			</table>
		)
	}
}
// end::book-list[]

// tag::book[]
class Book extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.book.title}</td>
				<td>{this.props.book.author}</td>
				<td>{this.props.book.isbn}</td>
			</tr>
		)
	}
}
// end::book[]

// tag::render[]
ReactDOM.render(
	<App />,
	document.getElementById('react')
)
// end::render[]