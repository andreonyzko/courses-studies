function Post(title, body, author){
    this.title = title.toUpperCase();
    this.body = body;
    this.author = author;
    
    this.views = 0;
    this.comments = [];
    this.isLive = false
}

const post = new Post('New Computer', 'This is my new computer with RX7600', 'Andre');

const message =
`${post.title.toUpperCase()}
${post.body}
👁️ ${post.views}
`;
console.log(message, post.comments);