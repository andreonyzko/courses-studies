const post = {
    title: 'New Computer',
    body: 'This is my new computer with RX7600',
    author: 'Andre',
    views: 1000,
    comments: [
        {author: 'Kaua', body: `Let's play`},
        {author: 'Lucas', body: `Give me a new computer configuration`}
    ],
    isLive: false
}

const message =
`${post.title.toUpperCase()}
${post.body}
👁️ ${post.views}
`;

console.log(message, post.comments);
